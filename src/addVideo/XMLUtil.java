package addVideo;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Factory getBean(String s)
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/config.xml"));

            //获取包含品牌名称的文本节点
            NodeList n1=doc.getElementsByTagName("beanName");
            int num=Integer.parseInt(s);
            Node classNode=n1.item(num).getFirstChild();
            String beanName=classNode.getNodeValue().trim();

            Class c=Class.forName("addVideo."+beanName);
            Factory factory=(Factory) c.newInstance();
            return factory;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
}
