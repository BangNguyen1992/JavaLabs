package com.example.bangnguyen.rss;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bang Nguyen on 10/12/2015.
 */
import com.example.bangnguyen.rss.RssItem;

public class RssHandler extends DefaultHandler {
    public static final String ITEM = "item";
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String LINK = "link";
    public static final String DATE = "pubdate";
    private RssItem item;
    private List<RssItem> itemList = new ArrayList<RssItem>();
    private boolean started = false;
    private StringBuilder sBuilder = new StringBuilder();

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        // TODO Auto-generated method stub
        super.characters(ch, start, length);
        if(started && (sBuilder!=null)){
            sBuilder.append(ch, start, length);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        // TODO Auto-generated method stub
        super.endElement(uri, localName, qName);
        if (localName.equalsIgnoreCase(ITEM)) {
            itemList.add(item);
        } else if (started) {
            if (localName.equalsIgnoreCase(TITLE)) {
                item.setTitle(sBuilder.toString().trim());
            } else if (localName.equalsIgnoreCase(DESCRIPTION)) {
                item.setDescription(sBuilder.toString().trim());
            } else if (localName.equalsIgnoreCase(LINK)) {
                item.setLink(sBuilder.toString().trim());
            } else if (localName.equalsIgnoreCase(DATE)) {
                item.setDate(sBuilder.toString().trim());
            }
            sBuilder = new StringBuilder();

        }
    }

    public List<RssItem> getItemList() {
        return itemList;
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        // TODO Auto-generated method stub
        super.startElement(uri, localName, qName, attributes);
        if (localName.equalsIgnoreCase(ITEM)) {
            item = new RssItem();
            started = true;
        }
    }

}