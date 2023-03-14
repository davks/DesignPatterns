package factory4;

// Client doesn't know which response and service we will use
public class Client {
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory factory) {
        service = factory.createService();
        response = factory.createResponse();
    }

    // Method to comunicate with the source
    public void communicate() {
        if (service != null && response != null) {
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
