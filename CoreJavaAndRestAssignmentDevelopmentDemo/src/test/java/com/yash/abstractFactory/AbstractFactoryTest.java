package com.yash.abstractFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void shouldCheckPCDataUsingAbstractDesignPattern() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		String expectedRam = "2 GB";
		String expectedHDD = "500 GB";
		String expectedCPU = "2.4 GHz";

		assertEquals(expectedRam, pc.getRAM());
		assertEquals(expectedHDD, pc.getHDD());
		assertEquals(expectedCPU, pc.getCPU());
	}

	@Test
	public void shouldCheckServerDataUsingAbstractDesignPattern() {
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		String expectedRam = "16 GB";
		String expectedHDD = "1 TB";
		String expectedCPU = "2.9 GHz";

		assertEquals(expectedRam, server.getRAM());
		assertEquals(expectedHDD, server.getHDD());
		assertEquals(expectedCPU, server.getCPU());
	}

}
