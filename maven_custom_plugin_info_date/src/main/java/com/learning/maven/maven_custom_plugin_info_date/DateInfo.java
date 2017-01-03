package com.learning.maven.maven_custom_plugin_info_date;


import java.util.Date;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal date-info
 * 
 * 
 */
public class DateInfo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {

        Date currentDate = new Date();
        getLog().info("Current date is " + currentDate);
    }
}