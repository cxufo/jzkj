window.onload = function()
{
	var flag = 1;
	
	var oDivStar = document.getElementById("i-div-star");
	var aAStar = oDivStar.getElementsByTagName("a");
	
	var oSpanStar = document.getElementById("i-span-starNum");
	
	var oFormEvaluation = document.getElementById("i-form-evaluation");
	var oFormTextarea = oFormEvaluation.getElementsByTagName("textarea")[0];
	var oFormSubmit = oFormEvaluation.getElementsByTagName("input")[0];
	
	for(var i=0; i<aAStar.length;i++)
	{
		aAStar[i].index = i;
		aAStar[i].onmouseover = function()
		{
			if(flag == 0)
			{
				return;
			}
			else
			{
				for(var j=0;j<=this.index;j++)
				{
					var oImgStar = aAStar[j].getElementsByTagName("img")[0];
					oImgStar.style.display = "none";
				}
				oSpanStar.innerHTML = this.index +1 + '.0';
			}
		};
		

		aAStar[i].onmouseout = function()
		{
			if(flag == 0)
			{
				return;
			}
			else
			{
				for(var j=0;j<=this.index;j++)
				{
					var oImgStar = aAStar[j].getElementsByTagName("img")[0];
					oImgStar.style.display = "block";
				}
				oSpanStar.innerHTML = '';
			}
		};
		

		aAStar[i].onclick = function()
		{
			if(flag == 0)
			{
				return;
			}
			else
			{
				for(var j=0;j<=this.index;j++)
				{
					var oImgStar = aAStar[j].getElementsByTagName("img")[0];
					oImgStar.style.display = "none";
				}
				oSpanStar.style.color = '#FFFC01';
				flag = 0;
			}
		};
		
		
		oFormSubmit.onclick = function()
		{
			if(flag == 0 && oFormTextarea.value.length != 0)
			{
				oFormSubmit.disabled = "disabled";
			}
			else
			{
				alert("please score and write your evaluation in the box.");
				return false;
			}
		}
		
//		
//		if(flag == 0 || oFormTextarea.length == 0)
//		{
//			oFormSubmit.style.color = 'black';
//			oFormSubmit.disabled = "abled";
//		}
//		else
//		{
//			oFormSubmit.style.color = '#8E8F8F';
//			oFormSubmit.disabled = "disabled";
//		}
		
	}
}