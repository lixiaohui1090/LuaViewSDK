//
//  LVTapGestureRecognizer.h
//  LVSDK
//
//  Created by dongxicheng on 1/21/15.
//  Copyright (c) 2015 dongxicheng. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <Foundation/Foundation.h>
#import "LVHeads.h"
#import "UIGestureRecognizer+LuaView.h"

@interface LVTapGesture : UITapGestureRecognizer<LVProtocal, LVClassProtocal>

@property(nonatomic,weak) LView* lv_lview;
@property(nonatomic,assign) LVUserDataInfo* lv_userData;

-(id) init:(lv_State*) l;


+(int) lvClassDefine:(lv_State *)L globalName:(NSString*) globalName;


@end
