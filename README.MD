# Issues
1. After getting configs from agent, I still get runtime errors:
```Exception in thread "main" java.lang.ExceptionInInitializerError
           at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:291)
           at com.sun.xml.bind.v2.model.impl.RuntimeModelBuilder.<init>(RuntimeModelBuilder.java:62)
           at com.sun.xml.bind.v2.runtime.JAXBContextImpl.getTypeInfoSet(JAXBContextImpl.java:434)
           at com.sun.xml.bind.v2.runtime.JAXBContextImpl.<init>(JAXBContextImpl.java:282)
           at com.sun.xml.bind.v2.runtime.JAXBContextImpl.<init>(JAXBContextImpl.java:109)
           at com.sun.xml.bind.v2.runtime.JAXBContextImpl$JAXBContextBuilder.build(JAXBContextImpl.java:1142)
           at com.sun.xml.bind.v2.ContextFactory.createContext(ContextFactory.java:141)
           at com.sun.xml.bind.v2.JAXBContextFactory.createContext(JAXBContextFactory.java:35)
           at javax.xml.bind.ContextFinder.find(ContextFinder.java:358)
           at javax.xml.bind.JAXBContext.newInstance(JAXBContext.java:691)
           at javax.xml.bind.JAXBContext.newInstance(JAXBContext.java:632)
           at org.example.jaxb.JaxbProcessor.loadProperties(JaxbProcessor.java:17)
           at org.example.Main.main(Main.java:13)
   Caused by: java.lang.IllegalStateException: ReflectionNavigator.getInstance can't be found
           at com.sun.xml.bind.v2.model.impl.Utils$1.run(Utils.java:54)
           at com.sun.xml.bind.v2.model.impl.Utils$1.run(Utils.java:46)
           at java.security.AccessController.doPrivileged(AccessController.java:83)
           at com.sun.xml.bind.v2.model.impl.Utils.<clinit>(Utils.java:45)
           at com.oracle.svm.core.classinitialization.ClassInitializationInfo.invokeClassInitializer(ClassInitializationInfo.java:351)
           at com.oracle.svm.core.classinitialization.ClassInitializationInfo.initialize(ClassInitializationInfo.java:271)
           ... 12 more
```
