# scala-modbus-starter-kit
A modbus master implementation using Scala. 
This repo contains an example as to how to make a Modbus Master 
that can read the data from slaves and prints it. 

Steps for running this kit:

1. If you have a Modbus Slave then goto Step 7

2. Download ModbusPal : Modbus Slave Simulator from [here](https://sourceforge.net/projects/modbuspal/)

3. Execute the Modbus Pal Jar using command.
       
       `java -jar ModbusPal.jar`
       
4. It would look something like this .

![modbuswindow](https://user-images.githubusercontent.com/12807854/34904995-4585146e-f876-11e7-8cd9-2d033391efc0.png)

5. Change the port to 5002 and make a modbus slave with id 1 just like
in the screenshot below.

![image](https://user-images.githubusercontent.com/12807854/34905011-844e9170-f876-11e7-8aa7-fe0323f28181.png)

6. Click on the eye icon and a new window will appear . 
These represents the value in the register. You can change it accrodingly
to check your Modbus master implementation.

![image](https://user-images.githubusercontent.com/12807854/34905036-d266925e-f876-11e7-937f-ac8888533859.png)

7. Configure some environment variables. 
Here they are initialized with the default values feel free to change 
them.
     `
      export MODBUS_HOST="localhost"
      export MODBUS_PORT=5002
      export MODBUS_STARTING_REGISTER=0
      export MODBUS_MEASUREMENTS=5
      MODBUS_SLAVEID=1`
      
8. Run the app using this command.

    `./run.sh`
    

You will be getting an output something like this :

![image](https://user-images.githubusercontent.com/12807854/34905064-40a78dc2-f877-11e7-865e-72d5214ed55d.png)

I hope you enjoyed it ! Feel free to use it as per your needs . 

If you have time , please visit [Internity Foundation](http://www.internity.in/) or our [Blog](http://blog.internity.in/)

We are all in for a social cause so that we can bridge the gaps in our Education system.

Feel free to reach us out on twitter : [@internity_learn](https://www.twitter.com/internity_learn)

Maintainers: [@shiv4nsh](https://www.github.com/shiv4nsh) Shivansh
