package com.example.invent_manage_app.view;

import com.example.invent_manage_app.Controller.ChangeViewController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    private final StringProperty selectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane navbarView;
    private AnchorPane viewVendorsView;
    private AnchorPane viewGoodsView;
    private AnchorPane viewBillsView;
    private AnchorPane IssuedGoodsView;

    // CONSTRUCTOR
    public ViewFactory(){
        this.selectedMenuItem = new SimpleStringProperty("");
    }
    public StringProperty getSelectedMenuItem() {
        return selectedMenuItem;
    }

    // GETTING DASHBOARD VIEW
    public AnchorPane getDashboardView(){
        if(dashboardView == null){
            try{
                dashboardView = new FXMLLoader(getClass().getResource("/Styles/Dashboard.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    // GETTING VIEW VENDORS VIEW
    public AnchorPane getViewVendorsView() {
        if(viewVendorsView == null){
            try{
                viewVendorsView = new FXMLLoader(getClass().getResource("/Styles/viewVendors.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return viewVendorsView;
    }


    public AnchorPane getViewGoodsView() {
        if(viewGoodsView == null){
            try{
                viewGoodsView = new FXMLLoader(getClass().getResource("/Styles/viewGoods.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return viewGoodsView;
    }

    public AnchorPane getViewBillsView() {
        if(viewBillsView == null){
            try{
                viewBillsView = new FXMLLoader(getClass().getResource("/Styles/viewBills.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return viewBillsView;
    }

    public AnchorPane getIssuedGoodsView() {
        if(IssuedGoodsView == null){
            try{
                IssuedGoodsView = new FXMLLoader(getClass().getResource("/Styles/issuedGoods.fxml")).load();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return IssuedGoodsView;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Styles/login.fxml"));
        createStage(loader);
    }

    public void showMainWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Styles/Window.fxml"));
        ChangeViewController changeViewController = new ChangeViewController();
        loader.setController(changeViewController);
        createStage(loader);

    }
    private void createStage(FXMLLoader loader){
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        } catch (Exception e){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Inventory App");
        stage.setResizable(false);
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }
}
