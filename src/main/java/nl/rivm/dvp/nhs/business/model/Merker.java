package nl.rivm.dvp.nhs.business.model;

import lombok.Data;

@Data
public class Merker {
    String naam;
    Float waardeFloat;
    String waardeString;
    String classificatie;

}
