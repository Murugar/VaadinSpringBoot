package com.iqmsoft;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class Greetings extends Div
{
    public Greetings()
    {
    	
        setText("IQMSOFT Vaadin and Spring Boot");
    }
}
