package sham.web.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

@RunWith(Arquillian.class)
public class HomeControllerTest {

	
	@Deployment
    public static org.jboss.shrinkwrap.api.spec.WebArchive createDeployment() {
        return ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.WebArchive.class)
            .addClass(HomeController.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

	
	@Test
	public void should_control(){
		Assert.assertEquals("working", "working");
	}
}
