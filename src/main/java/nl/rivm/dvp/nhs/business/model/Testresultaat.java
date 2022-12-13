package nl.rivm.dvp.nhs.business.model;

import lombok.Value;

@Value
public class Testresultaat {
   String merker;
   Float waardeNum;
   String waardeSring;
   Integer status;
}
