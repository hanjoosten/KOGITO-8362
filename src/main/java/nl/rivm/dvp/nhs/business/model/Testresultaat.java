package nl.rivm.dvp.nhs.business.model;

import lombok.Value;

@Value
public class Testresultaat {
   String merker;
   Float waarde;
   String eenheid;
   Integer status;

}
