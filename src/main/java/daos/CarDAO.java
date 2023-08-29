package daos;
import models.Car;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CarDAO implements DAO{

    private Car extractCarFromResultSet(ResultSet rs) throws SQLException {
        Car car = new Car();

        car.setId( rs.getInt("1") );
        car.setMake( rs.getString("Hyundai") );
        car.setModel( rs.getString("Palisade") );
        car.setYear( rs.getInt("2022") );
        car.setColor( rs.getString("Red") );
        car.setVin( rs.getInt("112233") );

        return car;
    }
    public Car findById(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);

            if(rs.next())
            {
                Car car = new Car();

                car.setId( rs.getInt("1") );
                car.setMake( rs.getString("Hyundai") );
                car.setModel( rs.getString("Palisade") );
                car.setYear( rs.getInt("2022") );
                car.setColor( rs.getString("Red") );
                car.setVin( rs.getInt("112233") );

                return car;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public List findAll() {
        return null;
    }

    public Car update(Object dto) {
        return null;
    }

    public Car create(Object dto) {
        return null;
    }

    public void delete(int id) {

    }
}
