package com.agrotech.service;

import com.agrotech.controller.DashboardController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationService {
    private static NavigationService instance;

    private NavigationService() {}

    public static NavigationService getInstance() {
        if (instance == null) {
            instance = new NavigationService();
        }
        return instance;
    }

    public void navigateToDashboard(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dashboard-view.fxml"));
        Parent dashboardView = loader.load();

        DashboardController dashboardController = loader.getController();
        dashboardController.initializeWithData();

        Scene scene = new Scene(dashboardView);
        stage.setScene(scene);
        stage.show();
    }
}