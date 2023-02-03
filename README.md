# android studio
## 実行方法
sh ~/.local/android-studio/bin/studio.sh
## SDK
``` sudo apt update && sudo apt install android-sdk ```
でインストールしたが、必要なSDKがインストールされたかは不明
## Emulator 
複数のアプリ立ち上げ可能
# 2 はじめてのアプリ作成
## 2.1 プロジェクト作成
APIは最も古いのを選択
## 2.2 AVD
AVD Managerボタンがない。スマホとAndroidマークのdevice Managerが同等の機能
該当するHWを選択して、ダウンロード
Enable Device Frameのチェックボックスを外す
## 2.3 アプリの起動
▲で実行。Hello worldが表示される。
## 2.4 プロジェクトのファイル構成
manifestsフォルダがない。
## 2.5 アプリ開発の基本手順
以下の3つを変更してアプリを開発する
- res/layoutフォルダ内のレイアウトXMLファイル
- javaフォルダ内の.ktファイル
- res/valuesフォルダ内のstrings.xml

# 3 ビューとアクティビティ
## 3.1 ビューの基礎知識
- string.xmlに文字列情報を追加する