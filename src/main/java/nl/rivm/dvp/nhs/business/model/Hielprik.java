package nl.rivm.dvp.nhs.business.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Value;

@Value
public class Hielprik {
    // List<Screening> screening;
    List<Merker> uitslagen;
    LocalDateTime geboorteMoment;
    LocalDateTime afnameMoment;
    Integer zwangerschapsduur;
    Integer afnametermijnPrematuur;
    Integer geboortegewicht;
    Boolean bloedtransfusie;
    String bloedtransfusieType;
    LocalDateTime bloedtransfusieMoment;
    String hielprikType;
}
