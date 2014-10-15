window.onload = function()
{
	var oAPartTime = document.getElementById("i-a-partTime");
	var oAFullTime = document.getElementById("i-a-fullTime");
	
	var oDivPartTime = document.getElementById("i-div-partTimeList");
	var oDivFullTime = document.getElementById("i-div-fullTimeList");
	
	if(null == oDivFullTime)
	{
		oAPartTime.className = 'active';
	}

	if(null == oDivPartTime)
	{
		oAFullTime.className = 'active';
	}
	
	
	oAFullTime.onmouseover = function()
	{
		oAPartTime.className = 'c-a-options';
	};
	
	oAFullTime.onmouseout = function()
	{
		if(null != oDivPartTime)
		{
			oAPartTime.className = 'active';
		}
	};
	
	
	oAPartTime.onmouseover = function()
	{
		oAFullTime.className = 'c-a-options';
	};
	
	oAPartTime.onmouseout = function()
	{
		if(null != oDivFullTime)
		{
			oAFullTime.className = 'active';
		}
	};
		
};