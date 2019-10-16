package com.yash.immutableWithoutFinal;

import org.junit.Test;

public class ImmutableStudentWithoutFinalTest  {
	
	@Test
	public void shouldCreateImmutableClassWithoutUsingFinalKeyword() {
		ImmutableStudentWithoutFinal immutableStudentWithoutFinal = new ImmutableStudentWithoutFinal(101, "monali");
		immutableStudentWithoutFinal.getId();
		immutableStudentWithoutFinal.getName();
		immutableStudentWithoutFinal.toString();
	}
	

}
