//The program will prompt user to enter height and will generate Christmas tree of the input height
console.log("Enter Height of Christmas Tree..");
var prompt=require('prompt');
prompt.start();

prompt.get(['int'],function(err,res)
{

	for(var i=1;i<=res.int;i++)
	{
		process.stdout.write(" ");
	}
	console.log('*');
	for(var overall=1;overall<=1;overall++)
	{
	for(var i=1;i<=res.int;i++)
	{
		process.stdout.write(" ");
	}
	console.log('0');
	for(var times=1;times<=res.int;times++)
	{
	for(var sp=1;sp<=res.int-times;sp++)
	{
		process.stdout.write(" ");
	}
	for(var h=1;h<=times*2+1;h++)
	{
		process.stdout.write("0");
	}
	console.log(" ");
    }
    }
    if(Math.sqrt(res.int)>=2)
    {


    for(var linestime=1;linestime<=Math.sqrt(res.int);linestime++)
    {

    	for(var i=1;i<res.int;i++)
		{
			process.stdout.write(" ");
		}
		for(var it=1;it<=Math.sqrt(res.int);it++)
		{
		process.stdout.write("0");
		
		}
		console.log(" ");
    }
}
else
{
    for(var linestime=1;linestime<=3;linestime++)
    {

    	process.stdout.write(" ");
		for(var it=1;it<=2;it++)
		{
		process.stdout.write("0");
		
		}
		console.log(" ");
    }	
}

});

