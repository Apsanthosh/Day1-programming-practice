// Parent Class
class Device {

    // Accessible to subclasses
    protected String macAddress;

    // Accessible ONLY inside Device class
    private String serialNumber;

    // Constructor
    Device(String macAddress, String serialNumber) {
        this.macAddress = macAddress;
        this.serialNumber = serialNumber;
    }

    // Public method to safely access private data
    public String getSerialNumber() {
        return serialNumber;
    }
}
// Subclass
class Smartphone extends Device {

    Smartphone(String macAddress, String serialNumber) {
        super(macAddress, serialNumber);
    }

    void showDeviceInfo() {

        //  Allowed: protected member accessible in subclass
        System.out.println("MAC Address: " + macAddress);

        //  NOT Allowed: private member cannot be accessed directly
        // Uncommenting below line will cause COMPILER ERROR
        // System.out.println("Serial Number: " + serialNumber);

        //  Correct way: access via public getter
        System.out.println("Serial Number (via getter): " + getSerialNumber());
    }
}
// Main Class
public class ProtectedSandboxDemo {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone(
                "00:1A:2B:3C:4D:5E",
                "SN123456789"
        );

        phone.showDeviceInfo();
    }
}