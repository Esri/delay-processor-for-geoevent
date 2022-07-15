package com.esri.geoevent.processor.delay;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.security.GeoEventServerCryptoService;
import com.esri.ges.framework.i18n.BundleLogger;
import com.esri.ges.framework.i18n.BundleLoggerFactory;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.processor.GeoEventProcessor;
import com.esri.ges.processor.GeoEventProcessorServiceBase;

public class DelayProcessorService extends GeoEventProcessorServiceBase
{
  private static final BundleLogger LOGGER = BundleLoggerFactory.getLogger(DelayProcessorService.class);

  private Messaging                 messaging;

  public DelayProcessorService()
  {
    LOGGER.trace("Creating Delay Processor Service");
    this.definition = new DelayProcessorDefinition();
    LOGGER.trace("Set Delay Processor definition on service");
  }

  @Override
  public GeoEventProcessor create() throws ComponentException
  {
    DelayProcessor delayProcessor = new DelayProcessor(definition, messaging);
    return delayProcessor;
  }

  public void setMessaging(Messaging messaging)
  {
    this.messaging = messaging;
  }

  public void setCrypto(GeoEventServerCryptoService cryptoService)
  {
    LOGGER.error("Setting cryptoService: {0}", cryptoService);
    try
    {
      String pwd = "hello world";
      LOGGER.error("Encrypting: {0}", pwd);
      String encryptedPwd = cryptoService.encrypt(pwd);
      LOGGER.error("Encrypted {0}: {1}", pwd, encryptedPwd);
    }
    catch (Exception e)
    {
      LOGGER.error("Failed to encrypt password", e);
    }
  }
}
