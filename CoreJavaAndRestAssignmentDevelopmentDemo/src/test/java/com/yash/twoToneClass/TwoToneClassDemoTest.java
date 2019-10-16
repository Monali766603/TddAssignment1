package com.yash.twoToneClass;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TwoToneClassDemoTest {
	// TwoToneClassDemo demo= new TwoToneClassDemo();
	@Test
	public void shoulCreateTwoInstancesOfClass() {

		TwoToneClassDemo obj1 = TwoToneClassDemo.getInstance();
		TwoToneClassDemo obj2 = TwoToneClassDemo.getInstance();
		TwoToneClassDemo obj3 = TwoToneClassDemo.getInstance();

		int obj1Hashcode = obj1.hashCode();
		int obj2Hashcode = obj2.hashCode();
		int obj3Hashcode = obj3.hashCode();
		assertThat(obj2Hashcode, anyOf(is(obj3Hashcode), is(obj1Hashcode)));

	}

}
