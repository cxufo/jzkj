window.onload = function()
{
	var oAPartTime = document.getElementById("i-a-partTime");
	var oAFullTime = document.getElementById("i-a-fullTime");
	
	var oDivPartTime = document.getElementById("i-div-partTimeList");
	var oDivFullTime = document.getElementById("i-div-fullTimeList");
	
	oAPartTime.className = 'active';
	oDivPartTime.style.display = 'block';
	oDivFullTime.style.display = 'none';
	
	
	oAFullTime.onmouseover = function()
	{
		oAPartTime.className = 'c-a-options';
	};
	
	oAFullTime.onmouseout = function()
	{
		if(oDivPartTime.style.display == 'block')
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
		if(oDivFullTime.style.display == 'block')
		{
			oAFullTime.className = 'active';
		}
	};
	
	
	oAPartTime.onclick = function()
	{
		oAFullTime.className = 'c-a-options';
		oAPartTime.className = 'active';
		oDivFullTime.style.display = 'none';
		oDivPartTime.style.display = 'block';
	};
	
	oAFullTime.onclick = function()
	{
		oAFullTime.className = 'active';
		oDivPartTime.style.display = 'none';
		oDivFullTime.style.display = 'block';
	};
};