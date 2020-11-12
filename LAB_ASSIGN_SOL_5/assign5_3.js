class Stack{
	constructor()
	{
		this.variables=[];
	}
	push(element)
	{
		this.variables.push(element);
	}
	pop()
	{

		return this.variables.pop();
	}
	isempty()
	{
		return this.variables.length==0;
	}
	top()
	{
		return this.variables[this.variables.length-1];
	}
}
function parentheses_validator(string)
{
	var len=string.length;
	if(len==0)
	{
		return "Empty String";
	}
	var stack=new Stack();
	for(var i=0;i<len;i++)
	{
		if(string[i]!='('&&string[i]!='['&&string[i]!='{'&&string[i]!=']'&&string[i]!='}'&&string[i]!=')')
		{
			return "Not valid String";
		}
		if(string[i]=='('||string[i]=='['||string[i]=='{')
		{
			stack.push(string[i]);
		}
		else
		{
			if(string[i]==')')
			{
				if(stack.isempty())
				{
					return false;
				}
				if(stack.top()=='{'||stack.top()=='[')
				{
					return false;
				}

				else
				{
					stack.pop();
				}
			}
			if(string[i]=='}')
			{

				if(stack.isempty())
				{
					return false;
				}
				if(stack.top()=='('||stack.top()=='[')
				{
					return false;
				}
				else
				{
					stack.pop();
				}
				
			}
			if(string[i]==']')
			{

				if(stack.isempty())
				{
					return false;
				}
				if(stack.top()=='('||stack.top()=='{')
				{
					return false;
				}
				else
				{
					stack.pop();
				}
				
			}
		}
	}
	if(!stack.isempty())
	{
	    return false;
	}
	else
	{
		return true;
	}
}

console.log("Enter String To Validate..");
var prompt=require('prompt');
prompt.start();

prompt.get(['string'],function(err,res)
{
console.log(parentheses_validator(res.string));
});

//parentheses_validator function is the required function
//will print the response true/false depending on input string 
//and if string does not contains any braces/parentheses then 
//it would return not valid 