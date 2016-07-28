<?php
$file=fopen("exe1.txt","r") or exit("Unable to open the file");

while(!feof($file))
{
	echo fgets($file)."<br/>";
}
fclose($file);

/*我是第一次这么玩的好不好？*/



?>