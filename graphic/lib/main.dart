import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget{
  const MyApp({Key? key}) : super(key: key);
  final title = 'Graphic Sample';
  final message = 'サンプル・メッセージ';

  @override
  Widget build(BuildContext context){
    return MaterialApp(
      title: 'Flutter Demo',
      home: MyHomePage(
        title: this.title,
        message: this.message
      )
    );
  }
}

class MyHomePage extends StatefulWidget{
  final String title;
  final String message;
  const MyHomePage({
    Key? key,
    required this.title,
    required this.message
  }): super(key: key);

  @override
  _MyHomePageState createState() => _MyHomePageState();

}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color.fromARGB(255,255,255,255),
      appBar: AppBar(
        title: Text('App Name', style: TextStyle(fontSize: 30.0),),
      ),
      body: Container(
        child:CustomPaint(
          painter: MyPainter(),
        ),
      ),
    );
  }
}

class MyPainter extends CustomPainter{
  @override
  void paint(Canvas canvas, Size size){
    Paint p = Paint();
    p.style = PaintingStyle.fill;
    p.color = Color.fromARGB(150,0,200,255);
    Rect r = Rect.fromLTWH(50, 50, 150, 150);
    canvas.drawRect(r, p);

    p.style = PaintingStyle.stroke;
    p.color = Color.fromARGB(150, 200, 0, 255);
    p.strokeWidth = 10.0;
    r = Rect.fromLTWH(100.0, 100.0, 150.0, 150.0);
    canvas.drawRect(r, p);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) => true;
}