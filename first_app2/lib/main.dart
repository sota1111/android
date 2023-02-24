import 'package:flutter/material.dart';

void main(){
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('my birthday')
        ),
        body: Column(
          children:[
            Padding(
              padding: const EdgeInsets.all(2.0),
              child: TextField(
                decoration: InputDecoration(
                  labelText: 'name',
                  hintText: 'name',
                  icon: Icon(Icons.account_circle)
                ),
              ),
            ),
            DatePickerDialog(initialDate: DateTime(DateTime.now().year-10),
              firstDate: DateTime(DateTime.now().year-100),
              lastDate: DateTime(DateTime.now().year)
            ),
            ElevatedButton(
                onPressed: (){print("ボタンを押しました");},
                child: Text("生まれてから何日目？"),
            )
          ],
        ),
      ),
    );
  }
}