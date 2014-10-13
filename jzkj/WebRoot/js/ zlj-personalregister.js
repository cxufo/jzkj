//获取中英文字符串长度
function getStrLength(strValue) {
	var strLength = strValue.length;
	for (var j = 0; j < strValue.length; j++) {
		if (strValue.charCodeAt(j) > 255) {
			strLength++;
		}
	}
	return strLength;
}
window.onload = function() {
	var regName = document.getElementById('regName');// 企业名输入框
	var regNameRemind = document.getElementById('regNameRemind');// 企业名提示框
	var regPsw = document.getElementById('regPsw');// 密码输入框
	var regPswRemind = document.getElementById('regPswRemind');// 密码提示框
	var regLinkPhone = document.getElementById('regLinkPhone');// 联系电话输入框
	var regLinkPhoneRemind = document.getElementById('regLinkPhoneRemind');// 联系电话提示框
	var regEmail = document.getElementById('regEmail');// 联系邮箱输入框
	var regEmailRemind = document.getElementById('regEmailRemind');// 联系邮箱提示框
	var regPswRepeat = document.getElementById('regPswRepeat');// 密码重复输入框
	var regPswRemindRepeat = document.getElementById('regPswRemindRepeat');// 密码重复提示框

	regName.onfocus = function() {
		regName.style.border = 'solid 1px #7ABD54';
		regNameRemind.style.display = 'block';
		regName.style.color = '#555555';
	}
	regName.onblur = function() {
		regName.style.border = 'solid 1px #CCC';
		regName.style.color = '#999999';
		var registerName = /^[A-Za-z0-9\u4e00-\u9fa5]{4,50}$/;
		var strLength = getStrLength(regName.value);
		if (registerName.test(regName.value)) {
			regNameRemind.style.display = 'none';
			regNameRemind.style.border = 'solid 1px #CCC';
			regNameRemind.style.color = '#999999';
			regNameRemind.style.background = 'solid 1px #F7F7F7';
			return true;
		} else {
			regNameRemind.style.display = 'block';
			regNameRemind.style.border = 'solid 1px #FFBDBE';
			regNameRemind.style.background = 'solid 1px #FFEBEB';
			regNameRemind.style.color = '#FF0000';
			return false;
		}
	}
	regPsw.onfocus = function() {
		regPsw.style.border = 'solid 1px #7ABD54';
		regPswRemind.style.display = 'block';
		regPsw.style.color = '#555555';
	}
	regPsw.onblur = function() {
		regPsw.style.border = 'solid 1px #CCC';
		regPsw.style.color = '#999999';
		var registerName =/^.*[A-Za-z0-9\\w_-]+.*$/;
		var strLength = getStrLength(regPsw.value);
		if (registerName.test(regPsw.value)&&strLength<=18&&strLength>=6) {
			regPswRemind.style.display = 'none';
			regPswRemind.style.border = 'solid 1px #CCC';
			regPswRemind.style.color = '#999999';
			regPswRemind.style.background = 'solid 1px #F7F7F7';
			return true;
		} else {
			regPswRemind.style.display = 'block';
			regPswRemind.style.border = 'solid 1px #FFBDBE';
			regPswRemind.style.background = 'solid 1px #FFEBEB';
			regPswRemind.style.color = '#FF0000';
			return false;
		}
	}
	
	regPswRepeat.onfocus = function() {
		regPswRepeat.style.border = 'solid 1px #7ABD54';
		regPswRepeat.style.color = '#555555';
	}
	regPswRepeat.onblur = function() {
		regPswRepeat.style.border = 'solid 1px #CCC';
		regPswRepeat.style.color = '#999999';
		var repeatPsw = regPswRepeat.value;
		var password = regPsw.value;
		if (repeatPsw==password) {
			regPswRemindRepeat.style.display = 'none';
			regPswRemindRepeat.style.border = 'solid 1px #CCC';
			regPswRemindRepeat.style.color = '#999999';
			regPswRemindRepeat.style.background = 'solid 1px #F7F7F7';
			return true;
		} else {
			regPswRemindRepeat.style.display = 'block';
			regPswRemindRepeat.style.border = 'solid 1px #FFBDBE';
			regPswRemindRepeat.style.background = 'solid 1px #FFEBEB';
			regPswRemindRepeat.style.color = '#FF0000';
			return false;
		}
	}
	
	regLinkPhone.onfocus = function() {
		regLinkPhone.style.border = 'solid 1px #7ABD54';
		regLinkPhoneRemind.style.display = 'block';
		regLinkPhone.style.color = '#555555';
	}
	regLinkPhone.onblur = function() {
		// 电话、手机验证
		regLinkPhone.style.border = 'solid 1px #CCC';
		regLinkPhone.style.color = '#999999';
		var registerName1 = /^[1][0-9]{10}$/;
		var registerName = /^([0][0-9]{3}-)?[0-9]{7}$/;
		if (registerName.test(regLinkPhone.value)
				|| registerName1.test(regLinkPhone.value)) {
			regLinkPhoneRemind.style.display = 'none';
			regLinkPhoneRemind.style.border = 'solid 1px #CCC';
			regLinkPhoneRemind.style.color = '#999999';
			regLinkPhoneRemind.style.background = 'solid 1px #F7F7F7';
			return true;
		} else {
			regLinkPhoneRemind.style.display = 'block';
			regLinkPhoneRemind.style.border = 'solid 1px #FFBDBE';
			regLinkPhoneRemind.style.background = 'solid 1px #FFEBEB';
			regLinkPhoneRemind.style.color = '#FF0000';
			return false;
		}

	}
	regEmail.onfocus = function() {
		regEmail.style.border = 'solid 1px #7ABD54';
		regEmailRemind.style.display = 'block';
		regEmail.style.color = '#555555';
	}
	regEmail.onblur = function() {
		regEmail.style.border = 'solid 1px #CCC';
		regEmail.style.color = '#999999';

		var registerName = /^[a-z0-9_\-]+(\.[_a-z0-9\-]+)*@([_a-z0-9\-]+\.)+([a-z]{2}|aero|arpa|biz|com|cn|coop|edu|gov|info|int|jobs|mil|museum|name|nato|net|org|pro|travel)$/;
		var strLength = getStrLength(regEmail.value);
		if (registerName.test(regEmail.value)) {
			regEmailRemind.style.display = 'none';
			regEmailRemind.style.border = 'solid 1px #CCC';
			regEmailRemind.style.color = '#999999';
			regEmailRemind.style.background = 'solid 1px #F7F7F7';
			return true;
		} else {
			regEmailRemind.style.display = 'block';
			regEmailRemind.style.border = 'solid 1px #FFBDBE';
			regEmailRemind.style.background = 'solid 1px #FFEBEB';
			regEmailRemind.style.color = '#FF0000';
			return false;
		}
	}
	var regCheckbox = document.getElementById('regCheckbox');
	var comBtn = document.getElementById('comBtn');
	comBtn.onclick = function() {
		if(regName.onblur()&&regPsw.onblur()&&regPswRepeat.onblur()&&regLinkPhone.onblur()&&regEmail.onblur()&&regCheckbox.checked){
			return true;
		}else{
			alert("请填写完整的信息");
			return false;
		}
	}
	/*点击弹出注册协议框*/
	var regAgree = document.getElementById('regAgree');
	regAgree.onclick=function(){
		var agreeFrom = document.getElementById('agreeFrom');
		agreeFrom.style.display="block";
	}
	var regAgreeFormClose = document.getElementById('regAgreeFormClose');
	regAgreeFormClose.onclick=function(){
		var agreeFrom = document.getElementById('agreeFrom');
		agreeFrom.style.display="none";
	}
}
