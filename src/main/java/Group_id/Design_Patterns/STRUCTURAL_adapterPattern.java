package Group_id.Design_Patterns;

class GermanElectricSocket
{//gives the electricity once the connector, socket are German type
	public void plugIn(GermanConnector plug)
	{
		System.out.println("German Connector is plugged in to German Plug");
		plug.giveElectricity();
	}
}
class UKElectricSocket
{//gives the electricity once the connector, socket are UK type
	public void plugIn(UKConnector plug)
	{
		System.out.println("UK Connector is plugged in to UK Plug");
		plug.provideElectricity();
	}
}
interface UKConnector
{
	public void provideElectricity();
}
interface GermanConnector
{
	public void giveElectricity();
}
class GermanConnector_class implements GermanConnector
{
	public void giveElectricity()
	{
		System.out.println("German Connector is giving electricity");
	}
}
class UKConnector_class implements UKConnector
{
	public void provideElectricity()
	{
		System.out.println("UK Connector is providing electricity");
	}
}
class GermanToUKAdapter_class implements UKConnector
{
	GermanConnector connector;
	GermanToUKAdapter_class(GermanConnector c)
	{
		this.connector=c;
	}
	public void provideElectricity()
	{
		System.out.println("Adapter interface is provided between German Connector and UK Socket");
		connector.giveElectricity();
	}
}
public class STRUCTURAL_adapterPattern 
{
	public static void main(String args[])
	{
		System.out.println("German's socket and connector has \":\"  while UK's is :.\n In order to use German connector in UK, we use adapter pattern\n");
		UKElectricSocket UK_socket=new UKElectricSocket();	
		System.out.println("Trying to plug German connector to UK socket ");
		GermanConnector_class G_Connector=new GermanConnector_class();
		UKConnector UK_Adapter=new GermanToUKAdapter_class(G_Connector);
		UK_socket.plugIn(UK_Adapter);
	}
}
