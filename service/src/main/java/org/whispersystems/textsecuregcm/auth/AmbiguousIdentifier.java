package org.whispersystems.textsecuregcm.auth;

import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmbiguousIdentifier {

  private final UUID   uuid;
  private final String number;

  private static final Logger         logger         = LoggerFactory.getLogger(AmbiguousIdentifier.class);

  public AmbiguousIdentifier(String target) {

    // Print the target to Console, input it on login/registration
    logger.info("Your TARGET is :" + target);

    if (!target.contains("-")) {
      this.uuid   = null;
      this.number = target;
    } else {
      this.uuid   = UUID.fromString(target);
      this.number = null;
    }
  }

  public UUID getUuid() {
    return uuid;
  }

  public String getNumber() {
    return number;
  }

  public boolean hasUuid() {
    return uuid != null;
  }

  public boolean hasNumber() {
    return number != null;
  }
}
