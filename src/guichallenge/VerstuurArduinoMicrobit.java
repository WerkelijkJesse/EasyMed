/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guichallenge;
import jssc.*;

/**
 *
 * @author Bram
 */
public class VerstuurArduinoMicrobit {
    public static void VerstuurArduinoMicrobit (){
        SerialPort serialPort = new SerialPort("COM9");
            try {
                serialPort.openPort();
                serialPort.setParams(9600, 8, 1, 0);
                serialPort.writeBytes("Hello".getBytes());
                byte[] buffer = serialPort.readBytes(0);
                serialPort.closePort();
            }
            catch (SerialPortException ex){
                System.out.println(ex);
            }
    }
}
