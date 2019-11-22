
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartSample extends Application {

    final static String austria = "ไก่ทอด";
    final static String brazil = "ไก่ชีส";
    final static String france = "ไก่วิ้งแซ่บ";
    final static String italy = "นักเก็ตส์";
    final static String usa = "เฟรนฟราย";
    final static String u = "เบอร์เกอร์ไก่ทอด";
    final static String ur = "โค้ก";
    final static String uw = "เป๊ปซี่";
    final static String uq = "น้ำเปล่า";

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bar Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc
                = new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("กราฟแสดงการสั่งอาหาร");
        xAxis.setLabel("รายการอาหาร");
        yAxis.setLabel("จำนวนการสั่งซื้อ");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("รายการอาหารทั้งหมด");
        series1.getData().add(new XYChart.Data(austria, 205));
        series1.getData().add(new XYChart.Data(brazil, 201));
        series1.getData().add(new XYChart.Data(france, 100));
        series1.getData().add(new XYChart.Data(italy, 354));
        series1.getData().add(new XYChart.Data(usa, 120));
        series1.getData().add(new XYChart.Data(u, 124));
        series1.getData().add(new XYChart.Data(ur, 120));
        series1.getData().add(new XYChart.Data(uw, 125));
        series1.getData().add(new XYChart.Data(uq, 325));

        Scene scene = new Scene(bc, 800, 600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
