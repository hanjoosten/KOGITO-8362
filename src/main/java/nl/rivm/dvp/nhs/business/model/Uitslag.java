package nl.rivm.dvp.nhs.business.model;

import lombok.Value;

@Value
public class Uitslag {
   String merker;
   Float waarde;
   String eenheid;
   Integer status;

}
