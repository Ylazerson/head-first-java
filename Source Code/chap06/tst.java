// B"H //



private ArrayList<President> presidentsList = new ArrayList<President>();

President x = new President();
x.setName("Bob");

President y = new President();
y.setName("Same");

presidentsList.add(x);
presidentsList.add(y);

President z = new President();
z.setName("Same");

if (!presidentsList.contains(z)) 
{
	System.out.println("not true");
}


if (presidentsList.isEmpty()) 
{
	System.out.println("true");
}

presidentsList.indexOf(y);   // this would return int 1

presidentsList.size();


President b = presidentsList.get(1);

//presidentsList.remove(0);

//presidentsList.remove(x);