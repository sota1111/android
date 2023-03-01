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
        title: Text('MyTetris', style: TextStyle(fontSize: 30.0),),
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children:[
          CustomPaint(
            // draw Line
            painter: DrawLine(),
          ),
          CustomPaint(
            // draw Rectangle
            painter: DrawRectangle(),
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: [
              ElevatedButton(
                  onPressed: (){print("PressButton");},
                  child: Text("Left"),
              ),
              ElevatedButton(
                onPressed: (){print("PressButton");},
                child: Text("TurnAround"),
              ),
              ElevatedButton(
                onPressed: (){print("PressButton");},
                child: Text("Right"),
              ),
            ],
          )
        ]
      ),
    );
  }
}

class DrawRectangle extends CustomPainter{
  @override
  void paint(Canvas canvas, Size size){
    Paint p = Paint();
    p.style = PaintingStyle.fill;
    p.color = Color.fromARGB(150,0,200,255);
    Rect r = Rect.fromLTWH(-150, -305, 30, 30);
    canvas.drawRect(r, p);

    p.style = PaintingStyle.stroke;
    p.color = Color.fromARGB(150, 200, 0, 255);
    p.strokeWidth = 10.0;
    r = Rect.fromLTWH(100.0, 100.0, 150.0, 150.0);//左、上、幅、高さ
    //canvas.drawRect(r, p);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) => true;
}

class DrawLine extends CustomPainter{
  @override
  void paint(Canvas canvas, Size size){
    Paint p = Paint();
    p.style = PaintingStyle.stroke;
    p.strokeWidth = 2.0;
    p.color = Color.fromARGB(100, 0, 0, 0);
    var basePosX = -150.0;
    var basePosY = 10.0;
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