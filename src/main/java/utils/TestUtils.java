package utils;

import java.io.InputStream;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestUtils {
public static final long WAIT=20;



public Logger log() {
//	return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	return LogManager.getLogger(TestUtils.class.getName());
}

}
