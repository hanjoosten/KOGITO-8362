package nl.rivm.dvp.nhs.business.model;

import lombok.Value;

@Value
public class Testresultaten {
   String merker;
   Float waarde;
   String eenheid;
   Integer status;

}
