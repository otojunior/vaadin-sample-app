package br.org.otojunior.vaadin.sample;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Vaadin Sample App", shortName = "vaadin--sample--app")
public class AppShell implements AppShellConfigurator {
}
