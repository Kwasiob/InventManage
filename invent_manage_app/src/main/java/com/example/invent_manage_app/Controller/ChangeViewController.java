package com.example.invent_manage_app.Controller;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import com.example.invent_manage_app.Models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangeViewController implements Initializable {

    public BorderPane dashboard_container;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getSelectedMenuItem().addListener(((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "viewVendors" -> dashboard_container.setCenter(Model.getInstance().getViewFactory().getViewVendorsView());
                case "viewGoods" -> dashboard_container.setCenter(Model.getInstance().getViewFactory().getViewGoodsView());
                case "viewBills" -> dashboard_container.setCenter(Model.getInstance().getViewFactory().getViewBillsView());
                case "issuedGoods" -> dashboard_container.setCenter(Model.getInstance().getViewFactory().getIssuedGoodsView());
                default -> dashboard_container.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        }));


    }
}
