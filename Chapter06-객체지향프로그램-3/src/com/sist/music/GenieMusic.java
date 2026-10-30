package com.sist.music;

/*
 * <tr class="list" songid="117256249">
                                <td class="check"><input type="checkbox" class="select-check" title="NEON" /></td>
                                <td class="number">1
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                                <span class="rank"><span class="rank-none"><span
                                                        class="hide">유지</span></span></span>
                                            
                                            
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('88270548');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/088/270/548/88270548_1791433893779_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="NEON" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('117256249');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('117256249','1');return false;">
                                        
                                            
                                        
                                        
                                        
                                        
                                            
                                                NEON</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('83504429');return false;">A2O & A2O LITE</a>
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('88270548');return false;">NEON</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('117256249;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('117256249;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="117256249" id="add_my_album_117256249" onclick="fnAddMyAlbumForm('#add_my_album_117256249' , '117256249' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('117256249');return false;">다운로드</a></td>
                                    
                                    
                                

                                <td class="btns">
                                    <div class="toggle-button-box lyr-mv" id="list-mv_117256249">
                                        
                                            
                                                <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="NEON" onclick="fnPlayMv('117256249','3'); return false;">뮤직비디오 보기</a>
                                            
                                            
                                        
                                    </div>
                                </td>
                                <td class="more">
                                    <div class="toggle-button-box">
                                        <button type="button" class="btn btn-basic btn-more">더보기</button>
                                        <ul class="list">
                                            
                                                
                                                    <li><a href="#" class="item" title="공유" onclick="shareDo('117256249');return false;">공유하기/음악나누기</a></li>
                                                
                                                
                                            
                                            
                                                
                                                    <li><a href="#" class="item" title="선물" onclick="fnGiftSong('117256249');return false;">선물하기</a></li>
                                                
                                                
                                            
                                        </ul>
                                    </div>
                                </td>
                            </tr>
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic extends Music {
	// MovieVO[] => 초기화 static / 생성자
	public GenieMusic() {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements poster = doc.select("table.list-wrap a.cover img");
//			Elements rank = doc.select("table.list-wrap td.number");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++) {
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(i + 1);
				String temp = etc.get(i).text();
				System.out.println(temp.replaceAll("[^0-9]", ""));
				System.out.println(temp.replaceAll("[^가-힣]", ""));
				System.out.println("==================================================");
				musics[i] = new MusicVO();
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setPoster(poster.get(i).attr("src"));
				musics[i].setAlbum(album.get(i).text());
				musics[i].setRank(i + 1);
				String state = "";
				int id=0;
				if(temp.equals("유지")) {
					id = 0;
					state = "유지";
				} else {
					id = Integer.parseInt(temp.replaceAll("[^0-9]", ""));
					state = temp.replaceAll("[^가-힣]", "");
				}
				musics[i].setState(state);
				musics[i].setIdcrement(id);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
