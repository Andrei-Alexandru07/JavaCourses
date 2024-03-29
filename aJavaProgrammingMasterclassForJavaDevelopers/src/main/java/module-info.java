module aJavaProgrammingMasterclassForJavaDevelopers {

    requires javafx.media;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.web;
    requires org.junit.jupiter.params;
    requires org.junit.jupiter.engine;
    requires org.junit.jupiter.api;
    requires sqlite.jdbc;
    requires java.sql;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires java.desktop;

    opens kJavaFX.aHelloWorldFX;
    opens kJavaFX.bLayouts;
    opens kJavaFX.cControls;
    opens kJavaFX.dEvents;
    opens kJavaFX.eTodoList;
    opens kJavaFX.fJavaFXApplication;
    opens kJavaFX.gSceneBuilder;
    opens kJavaFX.hContactList;
    opens kJavaFX.hContactList.DataModel;
    opens lBasicInputAndOutputIncludingJavaUtil.cIntroductionToIO;
    opens lBasicInputAndOutputIncludingJavaUtil.dJavaNIO;
    opens lBasicInputAndOutputIncludingJavaUtil.eReadingAndWritingWithJavaNIO;
    opens lBasicInputAndOutputIncludingJavaUtil.fFileSystem;
    opens mConcurrencyInJava.hJavaFXBackgroundTasks;
    opens nLambdaExpressions.bJavaFxExample;

    exports kJavaFX.aHelloWorldFX;
    exports kJavaFX.bLayouts;
    exports kJavaFX.cControls;
    exports kJavaFX.dEvents;
    exports kJavaFX.eTodoList;
    exports kJavaFX.fJavaFXApplication;
    exports kJavaFX.gSceneBuilder;
    exports kJavaFX.hContactList;
    exports kJavaFX.hContactList.DataModel;
    exports lBasicInputAndOutputIncludingJavaUtil.cIntroductionToIO;
    exports lBasicInputAndOutputIncludingJavaUtil.dJavaNIO;
    exports lBasicInputAndOutputIncludingJavaUtil.eReadingAndWritingWithJavaNIO;
    exports lBasicInputAndOutputIncludingJavaUtil.fFileSystem;
    exports mConcurrencyInJava.hJavaFXBackgroundTasks;
    exports nLambdaExpressions.bJavaFxExample;
}
