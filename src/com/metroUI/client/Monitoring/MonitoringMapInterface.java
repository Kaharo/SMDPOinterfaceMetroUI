package com.metroUI.client.Monitoring;

import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.core.client.util.Padding;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Portlet;
import com.sencha.gxt.widget.core.client.container.*;

/**
 * Created by IntelliJ IDEA.
 * User: k.bazaraly
 * Date: 15.05.13
 * Time: 9:12
 * To change this template use File | Settings | File Templates.
 */
public class MonitoringMapInterface {
    public Widget asMonitoringWidget()
    {
        BorderLayoutContainer container = new BorderLayoutContainer();
        try
        {

            BorderLayoutContainer.BorderLayoutData northData = new BorderLayoutContainer.BorderLayoutData();

            //BorderLayoutContainer.BorderLayoutData centerData = new BorderLayoutContainer.BorderLayoutData();
            BorderLayoutContainer.BorderLayoutData leftData = new BorderLayoutContainer.BorderLayoutData();
            MarginData centerData = new MarginData();

            container.setBorders(false);
            container.setNorthWidget(asMainMenu());
            container.setWestWidget(asDashBoard(), leftData);
            container.setCenterWidget(asMap(), centerData);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return container;
    }

    private Widget asMainMenu()
    {
        ContentPanel cpMainMenuPanel = new ContentPanel();
        try
        {
            cpMainMenuPanel.setId("#cpMain");
            cpMainMenuPanel.setHeaderVisible(false);
            cpMainMenuPanel.setBorders(false);
            cpMainMenuPanel.setBodyBorder(false);

            HBoxLayoutContainer hcontainerForAllPanel = new HBoxLayoutContainer();
           // hcontainerForAllPanel.setPadding(new Padding(5));
            hcontainerForAllPanel.setHBoxLayoutAlign(HBoxLayoutContainer.HBoxLayoutAlign.TOP);
            hcontainerForAllPanel.setBorders(true);

            //Button bBack = new Button("<<");
            Image imgBack = new Image("images/imback.svg");

            Label lText = new Label("Monitoring");
            lText.setStyleName("MainMenu");

            hcontainerForAllPanel.add(imgBack, new BoxLayoutContainer.BoxLayoutData(new Margins(0, 0, 0, 0)));
            hcontainerForAllPanel.add(lText, new BoxLayoutContainer.BoxLayoutData(new Margins(0, 0, 0, 0)));
            cpMainMenuPanel.add(hcontainerForAllPanel);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return cpMainMenuPanel;
    }

    private Widget asMap()
    {
        ContentPanel cpMainMenu = new ContentPanel();
        try
        {
            cpMainMenu.setId("#cpMain");
            cpMainMenu.setHeaderVisible(false);
            //cpMainMenu.setBorders(false);
            cpMainMenu.setBodyBorder(false);

            Label lText = new Label("Map Places");
            lText.setStyleName("MainMenu");
            cpMainMenu.add(lText);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return cpMainMenu;
    }

    private Widget asDashBoard()
    {
        VBoxLayoutContainer vcontainerForDashboard = new VBoxLayoutContainer();

        try
        {
            ContentPanel cpDashboard = new ContentPanel();
            cpDashboard.setId("#cpDashBoard");
            cpDashboard.setHeaderVisible(false);
            cpDashboard.setBorders(false);
            cpDashboard.setBodyBorder(false);


            vcontainerForDashboard.setVBoxLayoutAlign(VBoxLayoutContainer.VBoxLayoutAlign.STRETCHMAX);

            PortalLayoutContainer c = new PortalLayoutContainer(3);
            c.add(createPortlet("Portlet 1", "Content 1"), 0);
            c.add(createPortlet("Portlet 2", "Content 2"), 1);
            c.add(createPortlet("Portlet 3", "Content 3"), 2);

            Label lText = new Label("Device Dashboards");
            lText.setStyleName("MainMenu");
            cpDashboard.add(lText);
            cpDashboard.add(c);
            vcontainerForDashboard.add(cpDashboard);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        

        return vcontainerForDashboard;
    }

    private Portlet createPortlet(String h, String l) {
        Portlet p = new Portlet();
        p.setHeadingText(h);
        p.setWidget(new Label(l));
        p.setPixelSize(200, 200);
        return p;
    }



}
