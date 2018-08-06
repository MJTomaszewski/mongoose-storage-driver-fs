package com.emc.mongoose.storage.driver.fs;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertTrue;

public class WindowsFileSystemTest {

	private Path path;

	@Before
	public void setUp()
	throws Exception {
		path = FileSystems.getDefault().getPath("D:", "tmp", "file.txt");
	}

	@Test @Ignore
	public final void test()
	throws Exception {
		new File(path.toString()).createNewFile();
		assertTrue(Files.exists(path));
		System.out.println(path);
	}

	@After
	public void tearDown()
	throws Exception {
		Files.deleteIfExists(path);
	}
}