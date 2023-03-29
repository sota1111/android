import 'package:flutter/material.dart';

class DrawLine extends CustomPainter{
  @override
  void paint(Canvas canvas, Size size){
    Paint p = Paint();
    p.style = PaintingStyle.stroke;
    p.strokeWidth = 2.0;
    p.color = Color.fromARGB(100, 0, 0, 0);
    var basePosX = -150.0;
    var basePosY = 50.0;
    for (var i = 0; i <= 10; i++){
      Rect r = Rect.fromLTRB(//左、上、右、下
          basePosX+30*i, basePosY+0.0, basePosX+30*i, basePosY+600);
      canvas.drawLine(r.topLeft, r.bottomRight, p);
    }
    for (var i = 0; i <= 20; i++){
      Rect r = Rect.fromLTRB(//左、上、右、下
          basePosX, basePosY+30*i, basePosX+300.0, basePosY+30*i);
      canvas.drawLine(r.topLeft, r.bottomRight, p);
    }
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) => true;
}