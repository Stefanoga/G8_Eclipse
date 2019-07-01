grammar G8;

begin	:	'TITLE' b1=TEXT {Titolo=$b1.text;} 'DRAWSPACE WIDTH' b2=FLOAT {DrawspaceWidth=$b2.text;} 'DRAWSPACE HEIGTH' b3=FLOAT {DrawspaceHeigth=$b3.text;} (list)* end
    		{System.out.println("<!doctype html>");
		 System.out.println("<html>");
		 System.out.println("<head>");
		 System.out.println("<title> " + Titolo + " </title>");
		 System.out.println("<style> canvas {border: 1px #000 dotted;} </style>");
		 System.out.println("<script>");
		 System.out.println("window.onload = function () {");
 		 System.out.println("var canvas = document.getElementById('" + Titolo + "');");
		 System.out.println("var context = canvas.getContext('2d');");
		}
	; 
	
list	:	line |  triangle |  rectangle |  curve |  circle |  ellipse
	;

line 	:	'LINE:' ('NAME' n=TEXT {Name=$n.text;})? 'XSTART' l1=FLOAT {float xstart=$l1.text;} 'YSTART' l2=FLOAT {float ystart=$l2.text;} 'XEND' l3=FLOAT {float xend=$l3.text;} 'YEND' l4=FLOAT {float yend=$l4.text;} ('COLOR' l5=RGB {String color=$l5.text;})? ('WIDTH' l6=FLOAT {float width=$l6.text;})? 
		{System.out.println("//" + Name);
		 System.out.println("context.beginPath();");
		 System.out.println("context.lineWidth = " + width + ";");
		 System.out.println("context.strokeStyle = " + color + ";");
		 System.out.println("context.moveTo( " + xstart + ", " + ystart + ");");
		 System.out.println("context.lineTo( " + xend + ", " + yend + ");");
		 System.out.println("context.stroke();");
		 System.out.println("context.closePath();");
		}
	;

triangle 	:	'TRIANGLE:' ('NAME' n=TEXT {Name=$n.text;})? 'XA' t1=FLOAT {float xa=$t1.text;} 'YA' t2=FLOAT {float ya=$t2.text;} 'XB' t3=FLOAT {float xb=$t3.text;} 'YB' t4=FLOAT {float yb=$t4.text;} 'XC' t5=FLOAT {float xc=$t5.text;} 'YC' t6=FLOAT {float yc=$t6.text;} ('COLOR' t7=RGB {String color=$t7.text;})? ('WIDTH' t8=FLOAT {float width=$t8.text;})? ('COLORBODY' t9=RGB {String colorbody=$t9.text;})?
			{System.out.println("//" + Name);
			 System.out.println("context.beginPath();");
		 	 System.out.println("context.lineWidth = " + width + ";");
		 	 System.out.println("context.strokeStyle = " + color + ";");
		 	 System.out.println("context.moveTo(" + xa + ", " + ya + ");");
		 	 System.out.println("context.lineTo(" + xb + ", " + yb + ");");
			 System.out.println("context.lineTo(" + xc + ", " + yc + ");");
			 System.out.println("context.stroke();");
			 System.out.println("context.fillStyle= " + colorbody + ";");
			 System.out.println("context.fill();");
			 System.out.println("context.closePath();");
			}
	;

rectangle 	:	'RECT:' ('NAME' n=TEXT {Name=$n.text;})? 'XSTART' r1=FLOAT {float xstart=$r1.text;} 'YSTART' r2=FLOAT {float ystart=$r2.text;} 'XEND' r3=FLOAT {float xend=$r3.text;} 'YEND' r4=FLOAT {float yend=$r4.text;} ('COLOR' r5=RGB {String color=$r5.text;})? ('WIDTH' r6=FLOAT {float width=$r6.text;})? ('COLORBODY' r7=RGB {String colorbody=$r7.text;})?
			{float heigth=r4-r2;
			 float breadth=r3-r1;
			 System.out.println("//" + Name);
			 System.out.println("context.beginPath();");
			 System.out.println("context.lineWidth = " + width + ";");
			 System.out.println("context.strokeStyle = " + color + ";");
			 System.out.println("context.rect( " + xstart + ", " + ystart + ", " + heigth + ", " + breadth + ");");
			 System.out.println("context.stroke();");
			 System.out.println("context.fillStyle= " + colorbody + ";");
			 System.out.println("context.fill();");
			 System.out.println("context.closePath();");
			}
	;

curve 	:	'CURV:' ('NAME' n=TEXT {Name=$n.text;})? 'XSTART' cu1=FLOAT {float xstart=$cu1.text;} 'YSTART' cu2=FLOAT {float ystart=$cu2.text;} 'XMIDDLE' cu3=FLOAT {float xmiddle=$cu3.text;} 'YMIDDLE' cu4=FLOAT {float ymiddle=$cu4.text;} 'XEND' cu5=FLOAT {float xend=$cu5.text;} 'YEND' cu6=FLOAT {float yend=$cu6.text;} ('COLOR' cu7=RGB {String color=$cu7.text;})? ('WIDTH' cu8=FLOAT {float width=$cu8.text;})? ('COLORBODY' cu9=RGB {String colorbody=$cu9.text;})?
		{System.out.println("//" + Name);
		 System.out.println("context.beginPath();");
		 System.out.println("context.lineWidth = " + width + ";");
		 System.out.println("context.strokeStyle = " + color + ";");
		 System.out.println("context.moveTo( " + xstart + ", " + ystart + ");");
		 System.out.println("context.quadraticCurveTo( " + xmiddle + ", " + ymiddle + ", " + xend + ", " + yend + ");");
		 System.out.println("context.stroke();");
		 System.out.println("context.fillStyle = " + colorbody + ";");
		 System.out.println("context.fill();");
		 System.out.println("context.closePath();");
		}
	;

circle 	:	'CIRC:' ('NAME' n=TEXT {Name=$n.text;})? 'XCENTER' ci1=FLOAT {float xcenter=$ci1.text;} 'YCENTER' ci2=FLOAT {float ycenter=$ci2.text;} 'RADIUS' ci3=FLOAT {float radius=$ci3.text;} ('STARTANGLE' ci4=FLOAT {float startangle=$ci4.text;})? ('ENDANGLE' ci5=FLOAT {float endangle=$ci5.text;})? ('COLOR' ci6=RGB {String color=$ci6.text;})? ('WIDTH' ci7=FLOAT {float width=$ci7.text;})? ('COLORBODY' ci8=RGB {String colorbody=$ci8.text;})?
		{System.out.println("//" + Name);
		 System.out.println("context.beginPath();");
		 System.out.println("var centerX = " + xcenter + ";");
		 System.out.println("var centerY = " + ycenter + ";");
		 System.out.println("var radius = " + radius + ";");
		 System.out.println("var startAngle = " + startangle + "* Math.PI;");
		 System.out.println("var endAngle = " + endangle + "* Math.PI;");
		 System.out.println("context.arc (centerX, centerY, radius, startAngle, endAngle);");
		 System.out.println("context.lineWidth = " + width + ";");
		 System.out.println("context.strokeStyle= " + color + ";");
		 System.out.println("context.stroke();");
		 System.out.println("context.fillStyle= " + colorbody + ";");
		 System.out.println("context.fill();");
		 System.out.println("context.closePath();");
		}
	;

ellipse 	:	'ELLIPS:' ('NAME' n=TEXT {Name=$n.text;})? 'XCENTER' e1=FLOAT {float xcenter=$e1.text;} 'YCENTER' e2=FLOAT {float ycenter=$e2.text;} 'SEMIN' e3=FLOAT {float semin=$e3.text;} 'SEMAX' e4=FLOAT {float semax=$e4.text;} ('STARTANGLE' e5=FLOAT {float startangle=$e5.text;})? ('ENDANGLE' e6=FLOAT {float endangle=$e6.text;})? ('ROTATION' e7=ROTATION {float rotation=$e7.text;})? ('COLOR' e8=RGB {String color=$e8.text;})? ('WIDTH' e9=FLOAT {float width=$e9.text;})? ('COLORBODY' e10=RGB {String colorbody=$e10.text;})?
			{System.out.println("//" + Name);
			 System.out.println("context.beginPath();");
		 	 System.out.println("var centerX = " + xcenter + ";");
		 	 System.out.println("var centerY = " + ycenter + ";");
		 	 System.out.println("var radiusMax = " + semax + ";");
		 	 System.out.println("var radiusMin= " + semin + ";");
		 	 System.out.println("var rotation= " + rotation + "*Math.PI/180;");
		 	 System.out.println("var startAngle=" + startangle +"*Math.PI/180;");
		 	 System.out.println("var endAngle=" + endangle + "*Math.PI/180;");
		 	 System.out.println("context.ellipse(centerX, centerY, radiusMax, radiusMin, rotation, startAngle, endAngle);");
		 	 System.out.println("context.lineWidth = " + width + ";");
		 	 System.out.println("context.strokeStyle= " + color + ";");
		 	 System.out.println("context.stroke();");
		 	 System.out.println("context.fillStyle= " + colorbody + ";");
		 	 System.out.println("context.fill();");
		 	 System.out.println("context.closePath();");
			}
	;

end	:	'END'
	{System.out.println("}");
	 System.out.println("</script>");
	 System.out.println("</head>");
 	 System.out.println("<body>");
	 System.out.println("<canvas id='" + Titolo + "' width='" + DrawspaceWidth + "' height='" + DrawspaceHeigth + "'></canvas>");
	 System.out.println("</body>");
	 System.out.println("</html>");
	}
	;

RGB	:	'#' ('0'..'9' | 'A'..'F' )+
	;

FLOAT	:   ('0'..'9')+ ('.'('0'..'9')*)?
    ;

TEXT	:	('a'..'z' | 'A'..'Z' | '0'..'9')+
	;

ROTATION	:	'-' ('0'..'9')+ ('.'('0'..'9')*)?  |  '+' ('0'..'9')+ ('.'('0'..'9')*)?
	;

COMMENT	:   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
WS	:   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;