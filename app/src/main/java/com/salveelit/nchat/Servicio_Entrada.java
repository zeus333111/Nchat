package com.salveelit.nchat;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servicio_Entrada extends Service {

    int mStartMode,port=6789;
    /*ServerSocket serverSocket=null;
    Socket clientSocket=null;
    //ServerThread serverThread = new ServerThread(clientSocket);
    Thread serverThread=new Thread(new ServerThread(clientSocket));*/

    @Override
    public void onCreate(){
        /*try{
            serverSocket=new ServerSocket(port);
            Log.i("Open Socket:","Listo para recibir");
        }catch (IOException e){
            Log.e("Open Socket:","No se puede escuchar el puerto");
            stopSelf();
        }
        while(true){
            try{
                clientSocket=serverSocket.accept();
                Log.i("Conn Socket:","Conectado");

                serverThread.start();

            }catch (IOException e){
                Log.e("Conn Socket:","Fallo enlace con cliente");
            }
        }*/

    }
    @Override
    public int onStartCommand(Intent intent,int flags, int startId){
        //El servicio es iniciado, por llamada de startService()
        return mStartMode;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onDestroy(){
        //serverThread.stop;
    }
    /*class ServerThread implements Runnable {
        ObjectInputStream in;
        PrintWriter out;
        String inputLine[],outputLine="Correcto";
        Socket socket;
        boolean ejecutando;

        public ServerThread(Socket socket){
            this.socket=socket;
        }
        public void run(){
            this.ejecutando=true;
            while(ejecutando){
                inputLine=new String[2];
                try{
                    out=new PrintWriter(socket.getOutputStream(),true);
                    in = new ObjectInputStream(socket.getInputStream());
                }catch (IOException e){
                    Log.e("En hilo:","Error en objetos");
                }
                try{
                    inputLine=(String[])in.readObject();
                    Log.i("En hilo:","Recivido");
                    //envia mensaje
                    out.write(outputLine);
                } catch (ClassNotFoundException e) {
                    Log.e("En hilo al enviar:",e.toString());
                } catch (IOException e) {
                    Log.e("En hilo al enviar:",e.toString());
                }
            }
            try{
                out.close();
                in.close();
                socket.close();
            }catch (IOException e){
                Log.e("En hilo;","Error al cerrar");
            }
        }
        public void stopRun(){
            this.ejecutando=false;
        }
    }*/
}
