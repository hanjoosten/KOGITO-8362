package nl.rivm.dvp.nhs.business.model;

import lombok.Value;

@Value
public class Merker {
   String naam;
   Float waarde;
   String eenheid;
   Integer status;

}
