/**
 * Test.java 2020年10月9日
 */
package com.mytest.test;

import org.junit.Test;

import com.mytest.service.DigitalConversion;

/**
 * <p>
 * <b>DigitalConversionTest</b> is 单元测试
 * </p>
 *
 * @since 2020年10月9日
 * @author zengwk
 * @version $Id$
 */
public class DigitalConversionTest {

	/**
	 * 数字转英文
	 */
	@Test
	public void test() {
		System.out.println("测试开始");
		DigitalConversion.digitsToLetters();
	}

}
