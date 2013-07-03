package com.metroUI.client.UI;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Portlet;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.*;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: k.bazaraly
 * Date: 25.06.13
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
public class Page {

    public Widget asPage()
    {
//        BorderLayoutContainer container = new BorderLayoutContainer();
          HorizontalLayoutContainer container = new HorizontalLayoutContainer();
        try
        {
            container.setId("#MainContainer");

//            container.getElement().getStyle().setBackgroundColor("white");
            container.setBorders(false);


            VerticalLayoutContainer vlcforRight = new VerticalLayoutContainer();
            vlcforRight.setBorders(false);
            vlcforRight.setId("#vlcRight");

            vlcforRight.add(asHeader(), new VerticalLayoutContainer.VerticalLayoutData(1, 0.3));
            vlcforRight.add(asMainView(), new VerticalLayoutContainer.VerticalLayoutData(1, 0.5));


            container.add(asDashBoard(), new HorizontalLayoutContainer.HorizontalLayoutData(0.25, 1));
            container.add(vlcforRight, new HorizontalLayoutContainer.HorizontalLayoutData(0.75, 1));
//            container.setNorthWidget(asHeader(), new BorderLayoutContainer.BorderLayoutData());
//            container.setWestWidget(asDashBoard(), new BorderLayoutContainer.BorderLayoutData());
//            container.setCenterWidget(vlcforRight);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return container;
    }

    private Widget setTestWidgets()
    {
        LayoutPanel lpTile = null;
        try {
            lpTile = new LayoutPanel();
            lpTile.setId("#lpTile");

            HorizontalLayoutContainer container = new HorizontalLayoutContainer();
            container.setId("#testWidget");
            container.setBorders(false);


            LayoutPanel lpActive = new LayoutPanel();

            lpActive.setId("#lpActive");
            lpActive.add(new Label("Active"));

            LayoutPanel lpDisactive = new LayoutPanel();
            lpDisactive.setId("#lpDisactive");
            lpDisactive.add(new Label("Disactive"));



            container.add(lpActive, new HorizontalLayoutContainer.HorizontalLayoutData(0.5,1));
            container.add(lpDisactive, new HorizontalLayoutContainer.HorizontalLayoutData(0.5,1));

            lpTile.add(container);
//            lpTile.add(lpDisactive);
//            lpTile.add(lpActive);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return lpTile;
    }

    private Widget asHeader()
    {
        LayoutPanel lpHeader = null;
        try
        {
            lpHeader = new LayoutPanel();
            lpHeader.setId("#lpHeader");


            lpHeader.add(setTestWidgets());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lpHeader;
    }

    private Widget asMainView()
    {
        LayoutPanel lpMainView = null;
        try
        {
            lpMainView =  new LayoutPanel();
            lpMainView.setId("#lpMainView");
            lpMainView.add(setTestWidgets());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lpMainView;
    }

    private Widget asDashBoard()
    {
//        VBoxLayoutContainer vcontainerForDashboard = new VBoxLayoutContainer();
        LayoutPanel lpDashboard = null;
        try
        {
            lpDashboard = new LayoutPanel();
            lpDashboard.setId("#lpDashBoard");

            lpDashboard.add(setTestWidgets());
//            cpDashboard.setHeaderVisible(false);
//            cpDashboard.setBorders(false);
//            cpDashboard.setBodyBorder(false);
//
//
//            vcontainerForDashboard.setVBoxLayoutAlign(VBoxLayoutContainer.VBoxLayoutAlign.STRETCHMAX);
//
//            PortalLayoutContainer c = new PortalLayoutContainer(3);
//            c.add(createPortlet("Portlet 1", "Content 1"), 0);
//            c.add(createPortlet("Portlet 2", "Content 2"), 1);
//            c.add(createPortlet("Portlet 3", "Content 3"), 2);
//
//            Label lText = new Label("Device Dashboards");
//            lText.setStyleName("MainMenu");
//            cpDashboard.add(lText);
//            cpDashboard.add(c);
//
//            vcontainerForDashboard.add(cpDashboard);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        return lpDashboard;
    }

    private Portlet createPortlet(String h, String l) {
        Portlet p = new Portlet();
        p.setHeadingText(h);
        p.setWidget(new Label(l));
        p.setPixelSize(200, 200);
        return p;
    }

}
