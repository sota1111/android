import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import '../main.dart';
import '../View/main_view.dart';


class CounterNotifier extends StateNotifier<int>{
  CounterNotifier(): super(0);

  void plus() => state++;
  void minus() => state--;
}

final counterProvider = StateNotifierProvider<CounterNotifier, int>(
      (ref) => CounterNotifier(),
);


class DrawRectangle extends CustomPainter{
  @override
  void paint(Canvas canvas, Size size){
    Paint p = Paint();
    p.style = PaintingStyle.fill;
    p.color = Color.fromARGB(150,0,200,255);
    Rect r = Rect.fromLTWH(0.0, 0.0, 30, 30);
    canvas.drawRect(r, p);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) => true;
}