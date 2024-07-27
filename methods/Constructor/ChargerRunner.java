class ChargerRunner
{
	public static void main(String[] args)
	{
		System.out.println("start charging the phone");
		Charger charger=new Charger();
		charger.company="samsung";
		charger.type='C';
		
		System.out.println("updated charger company:"+charger.company);
		System.out.println("updated charger type:"+charger.type);
		System.out.println("updated charger pins:"+charger.pins);
		System.out.println("end charging the phone");
		
	
	    System.out.println("=================================================");
	
	
		System.out.println("start scratching through claw");
		Claw claw=new Claw();
		claw.claws=5;
		claw.tear=true;
		
		System.out.println("updated claws:"+claw.claws);
		System.out.println("updated tear:"+claw.tear);
		System.out.println("updated name:"+claw.name);
		System.out.println("end scratching through claw");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start identify crow");
		Crow crow=new Crow();
		crow.colour="black";
		crow.wingspan=100;
		
		System.out.println("updated colour:"+crow.colour);
		System.out.println("updated wingspan:"+crow.wingspan);
		System.out.println("updated lifespan:"+crow.lifespan);
		System.out.println("end identify crow");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start clicking clock");
		Clock clock=new Clock();
		clock.price=500;
		clock.knock=true;
		
		System.out.println("updated price:"+clock.price);
		System.out.println("updated knock:"+clock.knock);
		System.out.println("updated shape:"+clock.shape);
		System.out.println("end identify clock");
		
		
        System.out.println("=================================================");
		
		System.out.println("start lolipop");
		Lolipop lolipop=new Lolipop();
		lolipop.price=15;
		lolipop.colour="Yellow";
		
		System.out.println("updated price:"+lolipop.price);
		System.out.println("updated colour:"+lolipop.colour);
		System.out.println("updated flavour:"+lolipop.flavour);
		System.out.println("end lolipop");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start collection of jean");
	    Jean jean=new Jean();
		jean.price=600;
		jean.type="baggy";
		
		System.out.println("updated price:"+jean.price);
		System.out.println("updated type:"+jean.type);
		System.out.println("updated size:"+jean.size);
		System.out.println("end collection of jean");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start typing keyBoard");
	    KeyBoard keyBoard=new KeyBoard();
		keyBoard.count=40;
		keyBoard.shape="square";
		
		System.out.println("updated count:"+keyBoard.count);
		System.out.println("updated shape:"+keyBoard.shape);
		System.out.println("updated works:"+keyBoard.works);
		System.out.println("end typing keyBoard");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start finding Mountains");
	    Mountains mountains=new Mountains();
		mountains.name="mullayanagiri";
		mountains.height=1930;
		
		System.out.println("updated name:"+mountains.name);
		System.out.println("updated height:"+mountains.height);
		System.out.println("updated loc:"+mountains.loc);
		System.out.println("end finding Mountains");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start match");
	    Stadium stadium=new Stadium();
		stadium.name="Chinnaswamy";
		stadium.match="RCB";
		
		System.out.println("updated name:"+stadium.name);
		System.out.println("updated match:"+stadium.match);
		System.out.println("updated loc:"+stadium.loc);
		System.out.println("end match");
		
		
		System.out.println("=================================================");
		
		
		System.out.println("start spraying");
	    Spray spray=new Spray();
		spray.price=150;
		spray.use="kill cockroach";
		
		System.out.println("updated price:"+spray.price);
		System.out.println("updated use:"+spray.use);
		System.out.println("updated name:"+spray.name);
		System.out.println("end spraying");
		
		
		
		
		
		
		
		
	}
}