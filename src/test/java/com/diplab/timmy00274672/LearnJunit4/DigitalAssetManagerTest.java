package com.diplab.timmy00274672.LearnJunit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class DigitalAssetManagerTest {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private File newFile;

    @Test
    public void newFile() throws IOException {
	newFile = tempFolder.newFile("test");
	assertThat(newFile.exists(), is(true));
	// System.out.println(newFile.getAbsolutePath());
    }

    @After
    public void after() {
	assertThat(newFile.exists(), is(true));
	newFile = null;
    }

    @Before
    public void before() {
	assertThat(newFile, CoreMatchers.nullValue());
    }
}